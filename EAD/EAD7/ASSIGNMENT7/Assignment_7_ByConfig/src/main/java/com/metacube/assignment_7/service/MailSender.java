package com.metacube.assignment_7.service;

/**
 * This is mail sender Interface
 * @author Murtaza Ali
 *
 */
public interface MailSender {

	/**
	 * This method send mail
	 * @return true if mail send else false
	 */
	public boolean sendMail();
}