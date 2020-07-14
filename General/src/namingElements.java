import Templates.matchTemplate;

public class namingElements {

	public static void main(String[] args) {
		String[][] elements = {
				{"Barium sulfide","BaS"},
				{"Manganese(III) idodide","MnI3"},
				{"Ammonium hydrogen phosphate","(NH4)2HPO4"},
				{"Carbon disulfide","CS2"},
				{"Lead(II) sufate","PbSO4"},
				{"Magnesium carbonate","MgCO3"},
				{"Potassium permanganate","KMnO4"},
				{"Silver bicarbonate","AgHCO3"},
				{"Bismuth(III) bromide","BiBr3"},
				{"Tetranitrogen tetrasulfide","N4S4"},
				{"Ferrous perchlorate","Fe(ClO4)2"},
				{"Chromium(III) chlorite","Cr(ClO4)2"},
				{"Tin(II) thiosulfate","SnS2O3"},
				{"Cuprous sulfite","Cu2SO3"},
				{"Sodium bisulfate","NaHSO4"},
				{"Carbon tetrachloride","CCl4"},
				{"Sodium acetate","NaC2H3O2"},
				{"Ferric dihydrogen phosphate","Fe(H2PO4)3"},
				{"Chromium(II) phosphate","Cr3(PO4)2"},
				{"Mercuric perchlorate","Hg(ClO4)2"},
				{"Nickel(II) borate","Ni3(BO3)2"},
				{"Cadmium thiocyanate","Cd(SCN)2"},
				{"Ammonium Sulfide","(NH4)2S"},
				{"Bismuth(III) bisulfite","Bi(HSO3)3"},
				{"Stronium chlorate","Sr(ClO3)2"},
				{"Aluminum bisulfide","Al(HS)3"},
				{"Diphosphorus trioxide","P2O3"},
				{"Zinc hydroxide","Zn(OH)2"},
				{"Silver chromate","Ag2CrO4"},
				{"Copper(II) acetate","Cu(C2H3O2)2"},
				{"Cobaltous iodide","CoI2"},
				{"Cuprous dichromate","Cu2Cr2O7"},
				{"Sodium peroxide","Na2O2"},
				{"Dinitrogen trioxide","N2O3"},
				{"Dichlorine heptoxide","Cl2O7"},
				{"Cobaltic nitite","Co(NO2)3"},
				{"Barium cynide","Ba(CN)2"},
				{"Hypochlorous acid","HClO"},
				{"Sulfurous acid","H2SO3"},
				{"Hydrobromic acid","HBr"},
				{"Nitric acid","HNO3"},
				{"Periodic acid","HIO4"},
				{"Bromous acid","HBrO2"},
				{"Iodic acid","HIO3"},
				{"Hydrosulfuric acid","H2S"},
				{"Perbromic acid","HBrO4"},
				{"Hydroflouric acid","HF"},
				{"Hypobromous acid","HBrO"},
				{"Mercurous chloride","Hg2Cl2"},
				{"Ferric cynate","Fe(CNO)3"}
				
		};
		
		matchTemplate Match = new matchTemplate(4, false);
		
		while(true) {
			Match.runTest(elements, 5);
		}

	}

}
