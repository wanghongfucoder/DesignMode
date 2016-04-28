public class Client {
	public static void main(String[] args) {
		Subject sub=ProxySubject();
		sub.request();
	}
}