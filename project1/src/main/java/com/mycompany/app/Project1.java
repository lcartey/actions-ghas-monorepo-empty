package com.mycompany.app;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

public class Project1 {
  public void test(HttpServletRequest req) {
	new File(req.getParameter("foo"));
   }
}
