package com.webapp.cpudemo.service;

import com.webapp.cpudemo.model.Cpu;

import java.util.List;

public interface CpuService {
    public Cpu saveCpu(Cpu cpu); //TODO later
    public List<Cpu> getAllCpus();
}
