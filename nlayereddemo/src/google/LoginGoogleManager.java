package google;

import core.GoogleService;

public class LoginGoogleManager implements GoogleService {

	@Override
	public void sendToVerifyMail(String email) {
		System.out.println(email + " kullanıcısna doğrulama mail'i gönderildi.");
	}

	@Override
	public boolean checkVerifyAccount(String email) {
		System.out.println(email + " kullanıcısının hesabı doğrulandı.");
		return true;
	}
}
