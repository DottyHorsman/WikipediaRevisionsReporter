package edu.bsu.cs.view;

import edu.bsu.cs.model.Revision;
import edu.bsu.cs.model.RevisionFormatterInterface;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class BetterRevisionFormatter implements RevisionFormatterInterface
{
    public String format(Revision revision)
    {
        LocalDateTime ldt = LocalDateTime.ofInstant(revision.timestamp, ZoneOffset.UTC);
        return String.format("On %s at %s (%s secs): a change by %s",
                ldt.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)),
                ldt.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)),
                revision.timestamp.atZone(ZoneOffset.UTC).getSecond(),
                revision.name);
    }
}
