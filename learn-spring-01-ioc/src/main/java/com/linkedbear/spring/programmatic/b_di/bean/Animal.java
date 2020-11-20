package com.linkedbear.spring.programmatic.b_di.bean;

import com.linkedbear.spring.programmatic.a_quickstart.bean.Person;

public abstract class Animal {
  protected String name;
  protected Person person;

  public void setName(String name) {
    this.name = name;
  }

  public void setPerson(Person person) {
    this.person = person;
  }

  public String getName() {
    return name;
  }

  public Person getPerson() {
    return person;
  }

  @Override
  public String toString() {
    return "person=" + person + ",name=" + name;
  }
}
