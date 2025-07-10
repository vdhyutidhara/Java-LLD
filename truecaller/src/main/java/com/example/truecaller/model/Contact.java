package com.example.truecaller.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contact {
    public Long id;
    private String name;
    private String phoneNumber;
    private boolean isSpam;
}
