package nyc.c4q.hakeemsackes_bramble.mtapp_vine.pojos;

import java.util.List;

/**
 * Created by hakeemsackes-bramble on 12/10/16.
 */

public class Comments {

    public int count;
    public String anchorStr;
    public List<Record> records = null;
    public Record previousPage;
    public String backAnchor;

    public Record getAnchor() {
        return anchor;
    }

    public void setAnchor(Record anchor) {
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

    public Record getNextPage() {
        return nextPage;
    }

    public void setNextPage(Record nextPage) {
        this.nextPage = nextPage;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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

    public Record anchor;
    public Record nextPage;
    public int size;

}
