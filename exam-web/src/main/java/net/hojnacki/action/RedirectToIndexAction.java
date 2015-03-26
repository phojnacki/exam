package net.hojnacki.action;


import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

@Action(value = "redirectToIndex", results = {@Result(name = "success", location = "/", type = "redirect")})
public class RedirectToIndexAction {

    public String execute() {
        return "success";
    }
}
