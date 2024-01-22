package com.PasteBinClone.PB.Clone.Controllers;

import com.PasteBinClone.PB.Clone.Models.InputText;
import com.PasteBinClone.PB.Clone.Repository.Texts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@Controller
public class Paste {
  private final Texts textsRepo;

  @Autowired
  public Paste(Texts texts) {
    this.textsRepo = texts;
  }

  @GetMapping("/")
  public String home(Model model) {
    List<InputText> pastes = textsRepo.findAll();
    model.addAttribute("pastes", pastes);
    return "homePage";
  }

  @GetMapping("/paste/{id}")
  public String getText(@PathVariable Integer id, Model model) {
    Optional<InputText> inputText = textsRepo.findById(id);
    model.addAttribute("paste", inputText.orElse(null));
    return "paste";
  }

  @PostMapping("/paste/save")
  public String savePaste(@RequestParam String inputText) {
    InputText paste = new InputText();
    paste.setInputText(inputText);
    textsRepo.save(paste);
    return "redirect:/";
  }
}