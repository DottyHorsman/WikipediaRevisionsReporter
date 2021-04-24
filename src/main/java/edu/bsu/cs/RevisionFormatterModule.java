package edu.bsu.cs;

import com.google.inject.AbstractModule;
import edu.bsu.cs.model.RevisionFormatterInterface;
import edu.bsu.cs.view.BetterRevisionFormatter;

public class RevisionFormatterModule extends AbstractModule
{
    @Override
    protected void configure()
    {
        bind(RevisionFormatterInterface .class).to(BetterRevisionFormatter.class);
    }
}
