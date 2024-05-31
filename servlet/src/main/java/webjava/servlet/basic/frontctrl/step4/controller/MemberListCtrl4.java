package webjava.servlet.basic.frontctrl.step4.controller;

import webjava.servlet.basic.frontctrl.ModelView;
import webjava.servlet.basic.frontctrl.step4.Controller4;
import webjava.servlet.student.member.Member;
import webjava.servlet.student.member.MemberRepos;

import java.util.List;
import java.util.Map;

public class MemberListCtrl4 implements Controller4{
    MemberRepos memberRepos=new MemberRepos();
    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {

        List<Member> members = memberRepos.findAll();

        model.put("members", members);
//        ModelView mv = new ModelView("members");
//        mv.getModel().put("members", members);

        return "members";
    }
}
