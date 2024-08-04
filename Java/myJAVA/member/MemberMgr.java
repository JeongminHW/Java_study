package member;

import java.util.*;
import java.sql.*;

public class MemberMgr {
	private DBConnectionMgr pool;

	public MemberMgr() {
		// 싱글톤 패턴
		pool = DBConnectionMgr.getInstance();
	}

	// 저장 : insert, post(form)
	public boolean insertMember(MemberBean bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false; // 제어권을 가짐
		try {
			con = pool.getConnection();
			sql = "insert tblmember values(null, ?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getName());
			pstmt.setString(2, bean.getPhone());
			pstmt.setString(3, bean.getAddress());
			pstmt.setString(4, bean.getTeam());
			int cnt = pstmt.executeUpdate();
			if (cnt == 1)
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}

	// 리스트
	public Vector<MemberBean> listMember() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		Vector<MemberBean> vlist = new Vector<MemberBean>();
		try {
			con = pool.getConnection();
			sql = "select * from tblmember";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				MemberBean bean = new MemberBean();
				bean.setNum(rs.getInt(1));
				bean.setName(rs.getString(2));
				bean.setPhone(rs.getString(3));
				bean.setAddress(rs.getString(4));
				bean.setTeam(rs.getString(5));
				vlist.addElement(bean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}

	// 레코드 하나
	public MemberBean getMember(int num) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		MemberBean bean = new MemberBean();
		try {
			con = pool.getConnection();
			sql = "select * from tblmember where num = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				bean.setNum(rs.getInt(1));
				bean.setName(rs.getString(2));
				bean.setPhone(rs.getString(3));
				bean.setAddress(rs.getString(4));
				bean.setTeam(rs.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return bean;
	}

	// 수정
	public boolean updateMember(MemberBean bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "update tblmember set name = ?, phone = ?, address = ?, team = ? where num = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getName());
			pstmt.setString(2, bean.getPhone());
			pstmt.setString(3, bean.getAddress());
			pstmt.setString(4, bean.getTeam());
			pstmt.setInt(5, bean.getNum());
			pstmt.executeUpdate();
			if(pstmt.executeUpdate() == 1)
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return flag;
	}

	// 삭제
	public boolean deleteMember(int num) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "delete from tblmember where num = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
			if (pstmt.executeUpdate() == 1)
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return flag;
	}
	
	//팀 이름 리스트
	public Vector<String> getTeamList(){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		Vector<String> vlist = new Vector<String>();
		try {
			con = pool.getConnection();
			sql = "select distinct team from tblmember";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vlist.addElement(rs.getString(1));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}

	// 우편번호 검색
	public Vector<ZipcodeBean> searchZipcode(String area3) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		Vector<ZipcodeBean> vlist = new Vector<ZipcodeBean>();
		try {
			// pool에서 Connection 빌려옴
			con = pool.getConnection();
			sql = "select * from tblzipcode where area3 like ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%" + area3 + "%");
			rs = pstmt.executeQuery();
			// 결과로 받은 데이터 커서는 첫번째 레코드 위에 존재
			while (rs.next()) {
				ZipcodeBean bean = new ZipcodeBean();
				// String zipcode = rs.getString("zipcode");
				// String area1 = rs.getString("area1");
				// String area2 = rs.getString("area2");
				// String area33 = rs.getString("area3");
				// System.out.println(zipcode + "\t" + area1 + "\t" + area2 + "\t" + area33);
				bean.setZipcode(rs.getString("zipcode"));
				bean.setAREA1(rs.getString("area1"));
				bean.setAREA2(rs.getString("area2"));
				bean.setAREA3(rs.getString("area3"));
				// bean을 벡터에 저장
				vlist.addElement(bean);
			}
			// System.out.println(vlist.size());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// con 반납, pstmt와 rs close
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}

	public static void main(String[] args) {
		MemberMgr mgr = new MemberMgr();
		MemberBean bean = new MemberBean();
		// mgr.searchZipcode("광평로");
		// mgr.listMember();
		/*bean.setName("이재훈");
		bean.setPhone("010-5555-2323");
		bean.setAddress("부산시 연제구");
		bean.setTeam("동의대");
		boolean result = mgr.insertMember(bean);
		System.out.println(result);*/
	}
}
