module weather.airly {
    requires spring.context;
    requires spring.boot;
    requires spring.beans;
    requires spring.web;
    requires spring.boot.autoconfigure;
    exports weather.airly.service;
    exports weather.airly.model;
}