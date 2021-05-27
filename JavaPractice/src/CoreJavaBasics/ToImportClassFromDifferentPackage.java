package CoreJavaBasics;

import PackageImportDemo.packageClass;

public class ToImportClassFromDifferentPackage {

	public static void main(String[] args) {
		packageClass obj = new packageClass();   // creating obj for of diff class from different package
		obj.packagedemo();
		/*
		 Packages: set of classes, interfaces...
Java.lang is a package where int,array all these are present but we are not importing them because this is default package that comes with java complier
Java.util – all collections interfaces comes from this package 
Java.io – package for file input and output or file reading

Syntax to import a package
import packagename.classname
class A can use class b methods by directly creating obj for class b in class A if they both belong to same package if they are not from same package they need to import package

		 */
		

	}

}
