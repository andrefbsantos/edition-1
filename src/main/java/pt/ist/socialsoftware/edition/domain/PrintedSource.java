package pt.ist.socialsoftware.edition.domain;

public class PrintedSource extends PrintedSource_Base {

	public PrintedSource() {
		super();
	}

	@Override
	public void print() {
		System.out.print(getTitle() + ":");
	}

	@Override
	public String getName() {
		return getTitle();
	}

}
