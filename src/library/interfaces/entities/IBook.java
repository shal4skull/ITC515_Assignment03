/*
 * Decompiled with CFR 0_115.
 */
package library.interfaces.entities;

import library.interfaces.entities.EBookState;
import library.interfaces.entities.ILoan;

public interface IBook {
    public void borrow(ILoan var1);

    public ILoan getLoan();

    public void returnBook(boolean var1);

    public void lose();

    public void repair();

    public void dispose();

    public EBookState getState();

    public String getAuthor();

    public String getTitle();

    public String getCallNumber();

    public int getID();
}

