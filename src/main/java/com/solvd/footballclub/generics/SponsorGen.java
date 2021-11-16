package com.solvd.footballclub.generics;

public class SponsorGen<Sponsor, Sponsor2, Sponsor3> {
    private Sponsor sp;
    private Sponsor sp2;
    private Sponsor sp3;

    public SponsorGen(Sponsor sp, Sponsor sp2, Sponsor sp3) {
        this.sp = sp;
        this.sp2 = sp2;
        this.sp3 = sp3;

    }

    @Override
    public String toString() {
        return "SponsorGen" + "\n"+
                "sp=" + sp + "\n"+
                ", sp2=" + sp2 + "\n"+
                ", sp3=" + sp3 + "\n";
    }
}
