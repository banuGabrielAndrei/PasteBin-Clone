package com.PasteBinClone.PB.Clone.Repository;
import com.PasteBinClone.PB.Clone.Models.InputText;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Texts extends JpaRepository<InputText, Integer> {
}