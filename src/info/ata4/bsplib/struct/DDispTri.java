/*
 ** 2011 September 25
 **
 ** The author disclaims copyright to this source code.  In place of
 ** a legal notice, here is a blessing:
 **    May you do good and not evil.
 **    May you find forgiveness for yourself and forgive others.
 **    May you share freely, never taking more than you give.
 */
package info.ata4.bsplib.struct;

import info.ata4.bsplib.lump.LumpDataInput;
import info.ata4.bsplib.lump.LumpDataOutput;
import java.io.IOException;

/**
 *
 * @author Nico Bergemann <barracuda415 at yahoo.de>
 */
public class DDispTri implements DStruct {
    
    public int tags;

    public int getSize() {
        return 2;
    }

    public void read(LumpDataInput li) throws IOException {
        tags = li.readUnsignedShort();
    }

    public void write(LumpDataOutput lo) throws IOException {
        lo.writeShort(tags);
    }
}
