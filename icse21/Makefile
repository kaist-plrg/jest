FILE=main

TEXSRC=	$(FILE).tex abstract.tex intro.tex \
				eval.tex related.tex conclusion.tex \
				macros.tex ref.bib

$(FILE).pdf: $(TEXSRC)
	pdflatex $(FILE).tex && \
	bibtex $(FILE) && \
	pdflatex $(FILE).tex && \
	pdflatex $(FILE).tex

.PHONY: clean

clean:
	rm -rf *~ *.aux *.log *.out *.bbl *.blg *.bak *.vtc $(FILE).pdf
