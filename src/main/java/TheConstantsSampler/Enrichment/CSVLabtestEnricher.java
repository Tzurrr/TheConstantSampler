package TheConstantsSampler.Enrichment;

import TheConstantsSampler.LabTests.TestData;
import health_care_provider.HealthCareInfoProvider;
import health_care_provider.errors.InvalidIdException;
import health_care_provider.models.PersonInsured;

public class CSVLabtestEnricher implements Enricher{
    HealthCareInfoProvider healthCareInfoProvider = new HealthCareInfoProvider();
    public PersonInsured enrich(int IDNum, int IDType) throws InvalidIdException {
        //if (IDType != 0 || IDNum > 99999999 && IDNum < 1000000000) {
            return healthCareInfoProvider.fetchInfo(IDNum, IDType);
        //}
        //else {
          //  return null;
        //}
    }
}
