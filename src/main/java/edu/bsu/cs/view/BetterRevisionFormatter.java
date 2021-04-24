package edu.bsu.cs.view;

import edu.bsu.cs.model.Revision;
import edu.bsu.cs.model.RevisionFormatterInterface;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class BetterRevisionFormatter implements RevisionFormatterInterface
{
    //Previously
    //At 2013-05-19T20:53:42Z, a change by Bossanoven

    public String format(Revision revision)
    {
        LocalDateTime ldt = LocalDateTime.ofInstant(revision.timestamp, ZoneOffset.UTC);
        //Now
        //On Sunday, May 19, 2013 at 8:53 PM (42 secs): a change by Bossanoven
        return String.format("On %s at %s (%s secs): a change by %s",
                ldt.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)),
                ldt.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)),
                revision.timestamp.atZone(ZoneOffset.UTC).getSecond(),
                revision.name);
    }
}
