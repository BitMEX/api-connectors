package 

import (
	"net/http"
)

type Liquidation struct {

}

func LiquidationGet(w http.ResponseWriter, r *http.Request) {
		w.Header().Set("Content-Type", "application/json; charset=UTF-8")
		w.WriteHeader(http.StatusOK)
}

