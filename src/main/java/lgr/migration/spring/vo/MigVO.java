package lgr.migration.spring.vo;

import java.io.Serializable;

public class MigVO implements Serializable{
	private static final long serialVersionUID = 8002392101436863946L;
	private String mig_seq;
	private String mig_writer;
	private String mig_title;
	private String mig_content;
	
	public MigVO() {
	}

	public String getMig_seq() {
		return mig_seq;
	}

	public void setMig_seq(String mig_seq) {
		this.mig_seq = mig_seq;
	}

	public String getMig_writer() {
		return mig_writer;
	}

	public void setMig_writer(String mig_writer) {
		this.mig_writer = mig_writer;
	}

	public String getMig_title() {
		return mig_title;
	}

	public void setMig_title(String mig_title) {
		this.mig_title = mig_title;
	}

	public String getMig_content() {
		return mig_content;
	}

	public void setMig_content(String mig_content) {
		this.mig_content = mig_content;
	}

	@Override
	public String toString() {
		return "MigVO [mig_seq=" + mig_seq + ", mig_writer=" + mig_writer + ", mig_title=" + mig_title
				+ ", mig_content=" + mig_content + "]";
	}

	public MigVO(String mig_seq, String mig_writer, String mig_title, String mig_content) {
		super();
		this.mig_seq = mig_seq;
		this.mig_writer = mig_writer;
		this.mig_title = mig_title;
		this.mig_content = mig_content;
	}
	
	
}
