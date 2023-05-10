/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Jordy
 */
public class Ticket {

    public ArrayList<TicketEntry> Entries = new ArrayList<TicketEntry>();

    public void addEntry(TicketEntry entry) {
        for (TicketEntry e : Entries) {
            if (e.Name.equals(entry.Name)) {
                e.Number += entry.Number;
                e.Comments.addAll(entry.Comments);
                return;
            }
        }

        Entries.add(entry);
    }

    public int elementCount() {
        int res = 0;
        
        for (TicketEntry e : Entries) {
            res += e.Number;
        }
        
        return res;
    }
}
