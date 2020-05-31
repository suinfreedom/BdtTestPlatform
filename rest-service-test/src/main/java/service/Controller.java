package service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @RequestMapping(method={RequestMethod.GET},value={"/version"})
    public String getVersion()
    {
        logger.info(" -- REQUEST RECEIVED -- ");
        return "1.0";
    }
}