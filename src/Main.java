public class Main {
	public static void main(String[] args) {
		Author gogol = new Author("Николай", "Гоголь");
		Author tolstoy = new Author("Лев", "Толстой");
		Book nose = new Book( "Ревизор", gogol, 1775);
		Book warAndPiece = new Book( "Война и Мир", tolstoy, 1835);

		System.out.println( nose.getTitle()+ " "+ nose.getAuthorSurName() + " "+ nose.getAuthorName()
				+ " "+ nose.getPublishingYear());

		System.out.println( warAndPiece.getTitle()+ " "+ warAndPiece.getAuthorSurName()
				+ " "+ warAndPiece.getAuthorName() + " "+ warAndPiece.getPublishingYear());

		nose.setPublishingYear(1836);
		System.out.println( nose.getTitle()+ " "+ nose.getAuthorSurName() + " "+ nose.getAuthorName()
				+ " "+ nose.getPublishingYear());

		System.out.println(gogol.toString());
		System.out.println(tolstoy.toString());
		System.out.println(nose);

		System.out.println(gogol.hashCode());
		System.out.println(nose.hashCode());
	}
}