package com.mycompany.app;

import java.io.File;
import javax.servlet.http.HttpServletRequest;

public class Project1 {
  public void test(HttpServletRequest req) {
    new File(req.getParameter("foo")).canRead();
  }
}
