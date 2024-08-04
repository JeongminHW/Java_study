package awt;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileDialogEx1 extends MFrame implements ActionListener{
	FileDialog openFile, saveFile;
	Button openBtn, saveBtn;
	public FileDialogEx1() {
		openFile = new FileDialog(this, "파일 열기", FileDialog.LOAD);
		saveFile = new FileDialog(this, "파일 저장", FileDialog.SAVE);
		Panel p = new Panel();
		p.add(openBtn = new Button("파일 열기"));
		p.add(saveBtn = new Button("파일 저장"));
		add(p);
		openBtn.addActionListener(this);
		saveBtn.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == openBtn) { //getSource : 컴포넌트
			openFile.setVisible(true);
			String dir = openFile.getDirectory();
			String file = openFile.getFile();
			System.out.println(dir + file);
		}
		else if(e.getSource() == saveBtn) {
			saveFile.setVisible(true);
			String dir = saveFile.getDirectory();
			String file = saveFile.getFile();
			System.out.println(dir + file);	
		}
	}

	public static void main(String[] args) {
		new FileDialogEx1();
	}
}