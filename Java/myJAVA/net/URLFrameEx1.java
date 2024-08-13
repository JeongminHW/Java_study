package net;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLFrameEx1 extends MFrame implements ActionListener {

	TextArea ta;
	TextField tf;
	Button connect;
	Button save;
	URL url;

	public URLFrameEx1() {
		super(500, 500);
		setTitle("ViewHost");
		Panel p = new Panel();
		p.add(tf = new TextField("http://", 40));
		p.add(connect = new Button("connect"));
		p.add(save = new Button("save"));
		ta = new TextArea();
		add(p, BorderLayout.NORTH);
		add(ta);
		save.setEnabled(false);
		connect.addActionListener(this);
		save.addActionListener(this);
		tf.addActionListener(this);
		validate();
	}

	@Override 
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==tf||obj==connect) {
			ta.setText("");
			try {
				url = new URL(tf.getText());
				connectHost(url);
				save.setEnabled(true);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			connectHost(url);
		}else if(obj==save) {
			createFile("net/" + url.getHost() + ".html", ta.getText());
			ta.setText("저장하였습니다.");
			tf.setText("http://");
		}
	}

	public void connectHost(URL url) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
			String line = "";
			while(true) {
				line = br.readLine();
				if(line == null) break;
				ta.append(line + "\n");
			}
		} catch (Exception e) {
			ta.setText("해당 url은 없는 url입니다.");
			e.printStackTrace();
		}
		
	}
	
	public void createFile(String file, String content) {
		try {
			FileWriter fw = new FileWriter(file);
			String str = content;
			fw.write(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		URLFrameEx1 ex = new URLFrameEx1();
	}
}