package controllers;

import javax.inject.Inject;

import play.mvc.*;
import play.i18n.*;

import views.html.*;

public class HomeController extends Controller {

    private MessagesApi messagesApi;

    @Inject
    public HomeController(MessagesApi messagesApi) {
        this.messagesApi = messagesApi;
    }

    public Result index(Http.Request request) {
        Messages messages = this.messagesApi.preferred(request);
        
        return ok(index.render(messages.at("index.welcome"),messages));
    }

}
