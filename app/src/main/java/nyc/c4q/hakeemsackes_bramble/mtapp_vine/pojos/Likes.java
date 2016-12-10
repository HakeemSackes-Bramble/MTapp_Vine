package nyc.c4q.hakeemsackes_bramble.mtapp_vine.pojos;

import java.util.List;

/**
 * Created by hakeemsackes-bramble on 12/10/16.
 */

public class Likes {

    public int count;
    public String anchorStr;
    public List<Record> records;
    public Record previousPage;
    public String backAnchor;
    public int anchor;
    public int nextPage;
    public int size;

    public int getAnchor() {
        return anchor;
    }

    public void setAnchor(int anchor) {
        this.anchor = anchor;
    }

    public String getAnchorStr() {
        return anchorStr;
    }

    public void setAnchorStr(String anchorStr) {
        this.anchorStr = anchorStr;
    }

    public String getBackAnchor() {
        return backAnchor;
    }

    public void setBackAnchor(String backAnchor) {
        this.backAnchor = backAnchor;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }

    public Record getPreviousPage() {
        return previousPage;
    }

    public void setPreviousPage(Record previousPage) {
        this.previousPage = previousPage;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}