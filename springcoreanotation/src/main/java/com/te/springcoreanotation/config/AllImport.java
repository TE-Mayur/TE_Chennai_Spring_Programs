package com.te.springcoreanotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({Employee2Config.class})
@ComponentScan("com.te.springcoreanotation.beans")
public class AllImport {


}
