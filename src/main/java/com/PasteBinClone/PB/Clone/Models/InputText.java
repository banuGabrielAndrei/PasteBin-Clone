package com.PasteBinClone.PB.Clone.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "PasteBinClone")
public class InputText {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "texts")
  private String inputText;

  public InputText() {}

  public InputText(Integer id, String inputText) {
    this.id = id;
    this.inputText = inputText;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getInputText() {
    return inputText;
  }

  public void setInputText(String inputText) {
    this.inputText = inputText;
  }

  @Override
  public String toString() {
    return "InputText{" + "id=" + id + ", inputText='" + inputText + '\'' + '}';
  }
}