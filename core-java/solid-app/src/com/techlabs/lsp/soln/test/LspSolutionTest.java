package com.techlabs.lsp.soln.test;

import com.techlabs.lsp.soln.Rectangle;
import com.techlabs.lsp.soln.Square;

public class LspSolutionTest {

	public static void main(String args[]) {
		shouldNot_change_HeightIf_WidthIsModify(new Rectangle(100, 10));
		//shouldNot_change_HeightIf_WidthIsModify(new Square(100));
	}

	public static void shouldNot_change_HeightIf_WidthIsModify(Rectangle r) {
		int before = r.getHeight();
		r.setWidth(150);
		int after = r.getHeight();
		System.out.println(before == after);
		System.out.println(before);
		System.out.println(after);
	}
}
