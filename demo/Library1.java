package com.ebrain.demo;

import java.util.Scanner;

public class Library1 {
private String items;
private String item;
private String sub;
private String subname;
private String story;
private String bookname;
private String intro;

public String getBookname() {
	return bookname;
}

public void setBookname(String bookname) {
	this.bookname = bookname;
}

public String getItems() {
	return items;
}

public void setItems(String items) {
	this.items = items;
}

public String getItem() {
	return item;
}


public void setItem(String item) {
	this.item = item;
}

public String getSub() {
	return sub;
}

public void setSub(String sub) {
	this.sub = sub;
}

public String getSubname() {
	return subname;
}

public void setSubname(String subname) {
	this.subname = subname;
}

public String getStory() {
	return story;
}

public void setStory(String story) {
	this.story = story;
}

public String getIntro() {
	return intro;
}

public void setIntro(String intro) {
	this.intro = intro;
}

public static void main(String[] args) {
	String sub=" " ;
	String bookname ="ps,ps1,ps2";
	Scanner Library = new Scanner(System.in);
	System.out.println("Enter the items");
	String items = Library.nextLine();
	System.out.println("Select the items");
	String item = Library.nextLine();
	System.out.println("Enter the sub");
		sub = Library.nextLine();
	System.out.println("Select the sub name");
	String subname = Library.nextLine();
	System.out.println("Enter the tamil book name");
	System.out.println(bookname);
	System.out.println("Select the book name");
	String story = Library.nextLine();
	System.out.println("Enter the" + " story intro");
	String intro = Library.nextLine();
	Library1 lib = new Library1();
	lib.setItems(items);
	lib.setItem(item);
	lib.setSub(sub);
	lib.setSubname(subname);
	lib.setStory(story);
	lib.setBookname(bookname);
	lib.setIntro(intro);
	System.out.print(lib.getItems() + " \n" + lib.getItem() + "\n " + lib.getSub() + "\n" + lib.getSubname() + "\n "
			+ lib.getBookname() + "\n" + lib.getStory() + "\n " + lib.getIntro());
}
}


