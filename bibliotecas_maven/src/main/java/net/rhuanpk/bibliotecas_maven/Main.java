package net.rhuanpk.bibliotecas_maven;

import com.google.gson.Gson;

import net.rhuanpk.bibliotecas_maven.classes.Bar;
import net.rhuanpk.bibliotecas_maven.classes.Foo;

public class Main {

	public static void main(String[] args) {

		Gson gson = new Gson();

		Foo foo = new Foo(true);
		Bar bar = new Bar(true);

		System.out.println("foo: " + gson.toJson(foo));
		System.out.println("bar: " + gson.toJson(bar));

	}

}
