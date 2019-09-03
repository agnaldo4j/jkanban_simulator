package com.agnaldo4j.kanban.simulator.models.builders;

import com.agnaldo4j.kanban.simulator.models.EffortGenerator;
import com.agnaldo4j.kanban.simulator.models.RandomEffortGenerator;
import com.agnaldo4j.kanban.simulator.models.VirtualDay;

import java.util.SortedSet;
import java.util.TreeSet;

public class DefaultDays implements Builder<SortedSet<VirtualDay>> {

    private final EffortGenerator effortGenerator;

    public DefaultDays() {
        this(new RandomEffortGenerator());
    }

    public DefaultDays(EffortGenerator effortGenerator) {
        this.effortGenerator = effortGenerator;
    }

    public SortedSet<VirtualDay> build() {
        SortedSet<VirtualDay> days = new TreeSet<>();
        days.add(new VirtualDay(1, this.effortGenerator));
        days.add(new VirtualDay(2, this.effortGenerator));
        days.add(new VirtualDay(3, this.effortGenerator));
        days.add(new VirtualDay(4, this.effortGenerator));
        days.add(new VirtualDay(5, this.effortGenerator));
        days.add(new VirtualDay(6, this.effortGenerator));
        days.add(new VirtualDay(7, this.effortGenerator));
        days.add(new VirtualDay(8, this.effortGenerator));
        days.add(new VirtualDay(9, this.effortGenerator));
        days.add(new VirtualDay(10, this.effortGenerator));
        days.add(new VirtualDay(11, this.effortGenerator));
        days.add(new VirtualDay(12, this.effortGenerator));
        days.add(new VirtualDay(13, this.effortGenerator));
        days.add(new VirtualDay(14, this.effortGenerator));
        days.add(new VirtualDay(15, this.effortGenerator));
        days.add(new VirtualDay(16, this.effortGenerator));
        days.add(new VirtualDay(17, this.effortGenerator));
        days.add(new VirtualDay(18, this.effortGenerator));
        days.add(new VirtualDay(19, this.effortGenerator));
        days.add(new VirtualDay(20, this.effortGenerator));
        days.add(new VirtualDay(21, this.effortGenerator));
        days.add(new VirtualDay(22, this.effortGenerator));
        days.add(new VirtualDay(23, this.effortGenerator));
        days.add(new VirtualDay(24, this.effortGenerator));
        days.add(new VirtualDay(25, this.effortGenerator));
        days.add(new VirtualDay(26, this.effortGenerator));
        days.add(new VirtualDay(27, this.effortGenerator));
        days.add(new VirtualDay(28, this.effortGenerator));
        days.add(new VirtualDay(29, this.effortGenerator));
        days.add(new VirtualDay(30, this.effortGenerator));
        days.add(new VirtualDay(31, this.effortGenerator));
        days.add(new VirtualDay(32, this.effortGenerator));
        days.add(new VirtualDay(33, this.effortGenerator));
        days.add(new VirtualDay(34, this.effortGenerator));
        days.add(new VirtualDay(35, this.effortGenerator));
        days.add(new VirtualDay(36, this.effortGenerator));
        days.add(new VirtualDay(37, this.effortGenerator));
        days.add(new VirtualDay(38, this.effortGenerator));
        days.add(new VirtualDay(39, this.effortGenerator));
        days.add(new VirtualDay(40, this.effortGenerator));
        days.add(new VirtualDay(41, this.effortGenerator));
        days.add(new VirtualDay(42, this.effortGenerator));
        days.add(new VirtualDay(43, this.effortGenerator));
        days.add(new VirtualDay(44, this.effortGenerator));
        days.add(new VirtualDay(45, this.effortGenerator));
        days.add(new VirtualDay(46, this.effortGenerator));
        days.add(new VirtualDay(47, this.effortGenerator));
        days.add(new VirtualDay(48, this.effortGenerator));
        days.add(new VirtualDay(49, this.effortGenerator));
        days.add(new VirtualDay(50, this.effortGenerator));
        days.add(new VirtualDay(51, this.effortGenerator));
        days.add(new VirtualDay(52, this.effortGenerator));
        days.add(new VirtualDay(53, this.effortGenerator));
        days.add(new VirtualDay(54, this.effortGenerator));
        days.add(new VirtualDay(55, this.effortGenerator));
        days.add(new VirtualDay(56, this.effortGenerator));
        days.add(new VirtualDay(57, this.effortGenerator));
        days.add(new VirtualDay(58, this.effortGenerator));
        days.add(new VirtualDay(59, this.effortGenerator));
        days.add(new VirtualDay(60, this.effortGenerator));
        days.add(new VirtualDay(61, this.effortGenerator));
        days.add(new VirtualDay(62, this.effortGenerator));
        days.add(new VirtualDay(63, this.effortGenerator));
        days.add(new VirtualDay(64, this.effortGenerator));
        days.add(new VirtualDay(65, this.effortGenerator));
        days.add(new VirtualDay(66, this.effortGenerator));
        days.add(new VirtualDay(67, this.effortGenerator));
        days.add(new VirtualDay(68, this.effortGenerator));
        days.add(new VirtualDay(69, this.effortGenerator));
        days.add(new VirtualDay(70, this.effortGenerator));
        days.add(new VirtualDay(71, this.effortGenerator));
        days.add(new VirtualDay(72, this.effortGenerator));
        days.add(new VirtualDay(73, this.effortGenerator));
        days.add(new VirtualDay(74, this.effortGenerator));
        days.add(new VirtualDay(75, this.effortGenerator));
        days.add(new VirtualDay(76, this.effortGenerator));
        days.add(new VirtualDay(77, this.effortGenerator));
        days.add(new VirtualDay(78, this.effortGenerator));
        days.add(new VirtualDay(79, this.effortGenerator));
        days.add(new VirtualDay(80, this.effortGenerator));
        days.add(new VirtualDay(81, this.effortGenerator));
        days.add(new VirtualDay(82, this.effortGenerator));
        days.add(new VirtualDay(83, this.effortGenerator));
        days.add(new VirtualDay(84, this.effortGenerator));
        days.add(new VirtualDay(85, this.effortGenerator));
        days.add(new VirtualDay(86, this.effortGenerator));
        days.add(new VirtualDay(87, this.effortGenerator));
        days.add(new VirtualDay(88, this.effortGenerator));
        days.add(new VirtualDay(89, this.effortGenerator));
        days.add(new VirtualDay(90, this.effortGenerator));
        return days;
    }
}
