/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;

/**
 *
 * @author duong
 */
public class Email implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;
	private String from, to, subject, content, status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Email [id=" + id + ", from=" + from + ", to=" + to + ", subject=" + subject + ", content=" + content
				+ ", status=" + status + "]";
	}
	public Email() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Email(int id, String from, String to, String subject, String content, String status) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.subject = subject;
		this.content = content;
		this.status = status;
	}
	
	

}
