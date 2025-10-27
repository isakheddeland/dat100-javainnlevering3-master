package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggtabell;
    private int nesteledig;

	public Blogg() {

        innleggtabell = new Innlegg[20];
        nesteledig = 0;

	}

	public Blogg(int lengde) {

        innleggtabell = new Innlegg[lengde];
        nesteledig = 0;

	}

	public int getAntall() {

        return this.nesteledig;
	}
	
	public Innlegg[] getSamling() {
        return this.innleggtabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {

        for (int i = 0; i < nesteledig; i++){
            if (innleggtabell[i].erLik(innlegg)) {
                return i;
            }
        }
        return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		boolean funnet = false;

        for (int i = 0; i < nesteledig; i++) {
            if (innleggtabell[i].erLik(innlegg)) {
                funnet = true;
            }
        }
        return funnet;
	}

	public boolean ledigPlass() {
        return nesteledig < innleggtabell.length;


	}
	
	public boolean leggTil(Innlegg innlegg) {

        if (finnes(innlegg)) {
            return false;
        }

        if (nesteledig < innleggtabell.length){
            innleggtabell[nesteledig] = innlegg;
            nesteledig++;
            return true;

        }

        return false;

	}

    @Override
	public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(nesteledig).append("\n");

        for (int i = 0; i < nesteledig; i++){
            sb.append(innleggtabell[i].toString());
        }
        return sb.toString();
	}

//	// valgfrie oppgaver nedenfor
//
//	public void utvid() {
//		throw new UnsupportedOperationException(TODO.method());
//	}
//
//	public boolean leggTilUtvid(Innlegg innlegg) {
//
//		throw new UnsupportedOperationException(TODO.method());
//
//	}
//
//	public boolean slett(Innlegg innlegg) {
//
//		throw new UnsupportedOperationException(TODO.method());
//	}
//
//	public int[] search(String keyword) {
//
//		throw new UnsupportedOperationException(TODO.method());
//
//	}
}