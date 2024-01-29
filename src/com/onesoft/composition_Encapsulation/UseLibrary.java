package com.onesoft.composition_Encapsulation;

public class UseLibrary {
	public static void main(String[] args) {
		Book book=new Book();
		book.title="LoveStory";
		book.author="Williams";
		book.price=500;
		Library lib=new Library();
		lib.type="SilentLibrary";
		lib.location="Perungudi";
		lib.book=book;
		System.out.println(lib.book.price);
		
	}

}
