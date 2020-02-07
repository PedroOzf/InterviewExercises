package test.normalTests;

import normal.Breadcrumb;
import org.junit.Test;

import static org.junit.Assert.*;

public class BreadcrumbTest {
    @Test
    public void test(){
        String str = "https://www.linkedin.com/in/giacomosorbi";
        String expected = "<a href=\"/\">HOME</a> : <a href=\"/pictures/\">PICTURES</a> : <span class=\"active\">HOLIDAYS</span>";
        assertEquals(Breadcrumb.generate_bc(str, " * "),"<a href=\"/\">HOME</a> : <a href=\"/pictures/\">PICTURES</a> : <span class=\"active\">HOLIDAYS</span>");
    }
    @Test
    public void test2(){
        assertEquals(Breadcrumb.generate_bc("www.codewars.com/users/GiacomoSorbi", " / "), "<a href=\"/\">HOME</a> / <a href=\"/users/\">USERS</a> / <span class=\"active\">GIACOMOSORBI</span>");
    }

    @Test
    public void test3(){
        assertEquals(Breadcrumb.generate_bc(" www.very-long-site_name-to-make-a-silly-yet-meaningful-example.com/users/giacomo-sorbi", " + "), "<a href=\"/\">HOME</a> + <a href=\"/users/\">USERS</a> + <span class=\"active\">GIACOMO SORBI</span>");
    }

    @Test
    public void test4(){
        assertEquals(Breadcrumb.generate_bc("www.microsoft.com/docs/index.htm#top"," * "),"<a href=\"/\">HOME</a> * <span class=\"active\">DOCS</span>");
    }
}