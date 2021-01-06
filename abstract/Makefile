FILE=abstract

TEXSRC=abstract.tex

$(FILE).pdf: $(TEXSRC)
	pdflatex $(FILE).tex

.PHONY: clean

clean:
	rm -rf *~ *.aux *.log *.out *.bbl *.blg *.bak *.vtc $(FILE).pdf
