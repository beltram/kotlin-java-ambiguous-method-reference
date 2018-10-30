package com.beltram;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.beltram.MyCompanyExceptionKt.*;

class Person {
    private static final Logger logger = LoggerFactory.getLogger(Person.class);

    private void doSomething() {
        // this works
        logJava(logger::debug);
        // this fails with Function2... cannot be applied to <method reference>
        logKt(logger::debug);
        // this fails with ambiguous method call. Both Function2 and BiConsumer match
        log(logger::debug);
    }
}
