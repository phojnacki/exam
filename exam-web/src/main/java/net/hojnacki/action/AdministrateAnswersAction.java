package net.hojnacki.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

@Result(name = "success", location = "administrateAnswers.jsp")
@Action("administrateAnswers")
public class AdministrateAnswersAction {

    public String execute() {
        return "success";
    }
}
