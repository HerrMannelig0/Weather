module weather.jpa {
    requires spring.context;
    requires spring.boot;
    requires spring.beans;
    requires spring.web;
    requires spring.boot.autoconfigure;
    requires hibernate.jpa;
    requires spring.data.jpa;
    exports weather.db_communication.measurement;
}