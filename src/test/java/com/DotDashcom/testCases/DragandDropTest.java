package com.DotDashcom.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DotDashcom.pageObjects.DragandDropPageObjects;

public class DragandDropTest extends BaseClass{

	@Test
	public void drag_drop() {
		DragandDropPageObjects pageobj=new DragandDropPageObjects(driver);
		driver.get(url+"/drag_and_drop");
		
		pageobj.dragdrop();
	}
}
