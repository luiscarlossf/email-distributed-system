package EmailServer;


/**
* EmailServer/Email.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from email_interface.idl
* Domingo, 21 de Abril de 2019 09h05min28s BRT
*/

public final class Email implements org.omg.CORBA.portable.IDLEntity
{
  public long id = (long)0;
  public String sender = null;
  public String recipient = null;
  public String subject = null;
  public String body = null;

  public Email ()
  {
  } // ctor

  public Email (long _id, String _sender, String _recipient, String _subject, String _body)
  {
    id = _id;
    sender = _sender;
    recipient = _recipient;
    subject = _subject;
    body = _body;
  } // ctor

  public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}

} // class Email