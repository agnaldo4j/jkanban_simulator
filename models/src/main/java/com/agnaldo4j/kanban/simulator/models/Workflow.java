package com.agnaldo4j.kanban.simulator.models;

import com.agnaldo4j.kanban.simulator.models.commands.Event;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

import java.util.SortedSet;

public class Workflow extends Domain<Workflow> {

    private final Flow defaultFlow;
    private final SortedSet<Flow> flows;

    public Workflow(SortedSet<Flow> flows, Observer<Event<Workflow>> observer) {
        super(observer);
        this.flows = flows;
        this.defaultFlow = new Flow(0, MemberAbility.None, "undefined", new Observer<Event<Flow>>() {
            @Override
            public void onSubscribe(Disposable d) {}

            @Override
            public void onNext(Event<Flow> flowEvent) {}

            @Override
            public void onError(Throwable e) {}

            @Override
            public void onComplete() {}
        });
    }

    public SortedSet<Task> backlogTasks() {
        return flows
                .stream()
                .filter(flow -> flow.order() == 1)
                .findFirst()
                .orElse(defaultFlow)
                .tasks();
    }
}