package webjava.servlet.basic.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name ="reqHDServlet", urlPatterns = "/req-header")
public class ReqHDServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        printHttpReq(request);
        printHttpHD(request);

    }
    private static void printHttpReq(HttpServletRequest request) {
        System.out.println("##########요청 시작###############");
        System.out.println("request.getMethod() = " + request.getMethod());
        System.out.println("request.getProtocol() = " + request.getProtocol());
        System.out.println("request.getScheme() = " + request.getScheme());
        System.out.println("request.getRequestURL() = " + request.getRequestURL());
        System.out.println("request.getRequestURI() = " + request.getRequestURI());
        System.out.println("request.getQueryString() = " + request.getQueryString());
        System.out.println("request.isSecure() = " + request.isSecure());
        System.out.println("#########요청 종료#################");
    }
    private static void printHttpHD(HttpServletRequest request) {
        System.out.println("###########헤더정보 시작#################");
        request.getHeaderNames().asIterator().forEachRemaining(headerName -> System.out.println(headerName + ":" + request.getHeader(headerName)));
        System.out.println("###########헤더정보 끝#################");
        System.out.println();

    }

}
