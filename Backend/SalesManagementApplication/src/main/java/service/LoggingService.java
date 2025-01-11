package service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LoggingService {
    private Logger getLogging(Class<?> className) {
        return LoggerFactory.getLogger(className);
    }
}
