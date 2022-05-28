CREATE TABLE XX_TAJR
(
TAJR_SEQ_NB                 NUMBER(12) NOT NULL,
TAJR_MSG_DIR                VARCHAR2(1) DEFAULT 'O' NOT NULL, -- Outward , I - Inward
TAJR_MSG_DT                 DATE  NOT NULL,
TAJR_UNIQUE_REFERENCE       VARCHAR2(50) NOT NULL,
TAJR_RECORD_TYPE            VARCHAR2(10) NOT NULL,  --101 - Save Contract, 102 - Create Contract, 103 - Generate OTP, 104 - Downlaod COntract
TAJR_STS                    VARCHAR2(2) DEFAULT 'C' NOT NULL,
TAJR_RET_CD                 VARCHAR2(10),
TAJR_NOTES                  VARCHAR2(4000),
TAJR_REF_SEQ_NB             NUMBER(12), -- Sequence number of the Outward Request Message
TAJR_MESSAGE        CLOB,
TAJR_REQUEST_DT             DATE,
TAJR_RESPONSE_DT            DATE,
TAJR_renterotpvalue                     NUMBER,                                                                                                       --
TAJR_otpvalue                           NUMBER,                                                                                                       --
TAJR_SIGNATURE_ID                  NUMBER,
TAJR_tajeer_id                          NUMBER NOT NULL,
TAJR_personaddress                      VARCHAR2 (500),                                                                           --    Renter's Address
TAJR_email                              VARCHAR2 (50),                                                                      --    Renter's Email Address
TAJR_mobile                             VARCHAR2 (20),                                                                      --    Renter's Mobile Number
TAJR_idtypecode                         NUMBER,                                                   --    ID type (National id or Iqama,or gcc,or visitor)
TAJR_idnumber                           NUMBER,       --    Renter�s national identity number (Iqama ID for Non-Saudis) border number for (visitors-gcc)
TAJR_hijribirthdate                     NUMBER,                    --    Date of birth in hijri and the format is Number: (yyyymmdd) Example: (14430109)
TAJR_birthdate                          VARCHAR2 (30),
TAJR_nationalitycode                    VARCHAR2 (10),                                                                                --    From Lookup
TAJR_extrakmcost                        NUMBER,                                                                            --    The cost of an extra km
TAJR_rentdaycost                        NUMBER,                                                                              --    Car rent cost per day
TAJR_renthourcost                       NUMBER,                                                                             --    Car rent cost per hour
TAJR_fullfuelcost                       NUMBER,                                                                                     --    Full fuel cost
TAJR_driverfareperday                   NUMBER,                                                                                --    Driver fare per day
TAJR_driverfareperhour                  NUMBER,                                                                               --    Driver fare per hour
TAJR_vehicletransfercost                NUMBER,                                           --    The cost of transfer vehicle from branch to other branch
TAJR_internationalauthorizationcost     NUMBER,                                                                --    Cost of international authorization
TAJR_discount                           NUMBER,                                                                                --    Discount Percentage
TAJR_paid                               NUMBER,                                                                                            --    PrePaid
TAJR_extradrivercost                    NUMBER,                                                                               --    Cost of extra driver
TAJR_paymentmethodcode                  NUMBER,                                                           --    Payment method code from Lookup Services
TAJR_additionalcoveragecost             NUMBER,                                                     --    Cost of additional coverage(extended coverage)
TAJR_platenumber                        VARCHAR2 (10),                                                        --    Car plate number For example: (1234)
TAJR_firstchar                          VARCHAR2 (2),                                                      --    Car first plate letter For example: (?)
TAJR_secondchar                         VARCHAR2 (2),                                                     --    Car second plate letter For example: (?)
TAJR_thirdchar                          VARCHAR2 (2),
TAJR_extdrv_idtypecode                  NUMBER,                                                                                                       --
TAJR_exdrv_address                      VARCHAR2 (500),                                                                                               --
TAJR_extdrv_idnumber                    NUMBER,                                                                                                       --
TAJR_extdrv_hijribirthdate              NUMBER,                                                                                                       --
TAJR_extdrv_birthdate                   VARCHAR2 (30),                                                                                                --
TAJR_extendedcoverageid                 NUMBER,                              --    The id of the extended coverage Get id from extended coverage Service
TAJR_workingbranchid                    NUMBER,                            --    The id of the working branch - Get the id from get all branches service
TAJR_rentpolicyid                       NUMBER,                                                    --    The id of the policy Get id from policy service
TAJR_contractstartdate                  VARCHAR2 (30),                                    --    Contract start date, Must be greater than or equal today
TAJR_contractenddate                    VARCHAR2 (30),                                                                           --    Contract End Date
TAJR_authorizationtypecode              VARCHAR2(50),              --    The type of the authorization , internal or external From authorization lookup
TAJR_tammexternalauthorizationcountry   VARCHAR2 (50),                                    --    The countries that will the contract be authorized to it
TAJR_tammexternalauthorizationcode      NUMBER,                            --    Code of the External Authorization Country From Country Lookup Services
TAJR_carseatperday                      NUMBER,                                                                                                       --
TAJR_disabilitiesaidsperday             NUMBER,                                                                                                       --
TAJR_cardelivery                        NUMBER,                                                                                                       --
TAJR_navigationsystemperday             NUMBER,                                                                                                       --
TAJR_internetperday                     NUMBER,                                                                                                       --
TAJR_allowedkmperhour                   NUMBER,                                                                                --    Allowed Km Per Hour
TAJR_receivebranchid                    NUMBER,           --    The id branch that the renter receive the car - Get the id from get all branches service
TAJR_returnbranchid                     NUMBER, --    The id branch that the rented will return the car to it - Get the id from get all branches service
TAJR_allowedkmperday                    NUMBER,                                                                                 --    Allowed km Per Day
TAJR_contracttypecode                   NUMBER,                                                --    Code of the contract type From contract type lookup
TAJR_allowedlatehours                   NUMBER,
TAJR_contractnumber                     NUMBER,
TAJR_contractsigndate                   VARCHAR2 (30),
TAJR_branchId                           NUMBER,
TAJR_rentduration                  NUMBER,
TAJR_token                              VARCHAR2 (100),
TAJR_mainpayment_paid                   NUMBER,
TAJR_mainpayment_remaining              NUMBER,
TAJR_mainpayment_total                  NUMBER,
TAJR_mainpayment_vat                    NUMBER,                                                                            -- Main Payment Details - Vat
TAJR_othpayment_paid                    NUMBER,                                                                          -- Other Payment Details - Paid
TAJR_othpayment_remaining               NUMBER,                                                                     -- Other Payment Details - Remaining
TAJR_othpayment_total                   NUMBER,                                                                         -- Other Payment Details - Total
TAJR_othpayment_vat                     NUMBER,                                                                           -- Other Payment Details - Vat
TAJR_totpayment_paid                    NUMBER,                                                                          -- Total Payment Details - Paid
TAJR_totpayment_remaining               NUMBER,                                                                     -- Total Payment Details - Remaining
TAJR_totpayment_total                   NUMBER,                                                                         -- Total Payment Details - Total
TAJR_totpayment_vat                     NUMBER,                                                                           -- Total Payment Details - Vat
TAJR_contract_id                          NUMBER,
TAJR_contract_returnstatus              VARCHAR2 (100),
TAJR_ac                                 NUMBER,                                                                           --- Starts Rent STatus Details
TAJR_carseats                           NUMBER,
TAJR_fireextinguisher                   NUMBER,
TAJR_firstaidkit                        NUMBER,
TAJR_keys                               NUMBER,
TAJR_radiostereo                        NUMBER,
TAJR_safetytriangle                     NUMBER,
TAJR_screen                             NUMBER,
TAJR_sparetire                          NUMBER,
TAJR_sparetiretools                     NUMBER,
TAJR_speedometer                        NUMBER,
TAJR_tires                              NUMBER,
TAJR_sketchinfo_id                      NUMBER,
TAJR_notes                              VARCHAR2 (4000),
TAJR_availablefuel                      NUMBER,
TAJR_odometerreading                    NUMBER,
TAJR_other1                             VARCHAR2 (1000),
TAJR_other2                             VARCHAR2 (1000),
TAJR_arfullname                     VARCHAR2 (200),
TAJR_enfullname                     VARCHAR2 (200),
TAJR_drivelicensenumber             VARCHAR2 (30),
TAJR_idexpirydate                   VARCHAR2 (30),
TAJR_hijriidexpirydate              NUMBER,
TAJR_idcopynumber                   NUMBER,
TAJR_issueplacecode                 VARCHAR2 (10),
TAJR_licenseexpirydate              VARCHAR2 (30),
TAJR_nationaladdress                VARCHAR2 (500),
TAJR_workaddress                    VARCHAR2 (500),
TAJR_drivelicensetypecode           NUMBER,
TAJR_lifestatus                     VARCHAR2 (100),
TAJR_formattedhijridate             VARCHAR2 (30),
TAJR_extradriver                    VARCHAR2 (50),
TAJR_renteddriver                   VARCHAR2 (50),
TAJR_platenumber                    VARCHAR2(10),
TAJR_manufactureyear                VARCHAR2(20),
TAJR_color                          VARCHAR2 (20),
TAJR_operationcardnumber            VARCHAR2 (50),
TAJR_operationcardexpirydate        VARCHAR2 (20),
TAJR_insurancenumber                VARCHAR2 (30),
TAJR_insuranceexpirydate            VARCHAR2(30),
TAJR_operationcardexpirydateg       VARCHAR2(30),
TAJR_licenseexpirydateg             VARCHAR2 (30),
TAJR_additionalinsurance                VARCHAR2 (30),
TAJR_oilchangekmdistance                NUMBER,
TAJR_enduranceamount                    NUMBER,
TAJR_insurancetypecode                  NUMBER,
TAJR_fueltypecode                       NUMBER,
TAJR_oilchangedate                      VARCHAR2 (30),
TAJR_oiltype                            VARCHAR2 (100),
TAJR_otherfieldone                      VARCHAR2 (50),
TAJR_otherfieldtwo                      VARCHAR2 (50),
TAJR_numberofpassengers            NUMBER,
TAJR_platetype                      VARCHAR2 (100),
TAJR_brandnamear                    VARCHAR2 (100),
TAJR_brandnameen                    VARCHAR2 (100),
TAJR_modelnamear                     VARCHAR2 (100),
TAJR_modelnameen                    VARCHAR2(100),
TAJR_ownernumber                    NUMBER,
TAJR_coownernumber                  NUMBER,
TAJR_owneridversion                 NUMBER,
TAJR_mvpiexpirydateg                VARCHAR2 (30),
TAJR_authorizationstartdate         VARCHAR2 (30),
TAJR_authorizationenddate           VARCHAR2 (30),
TAJR_authorizationnumber            VARCHAR2 (50),
TAJR_paymenttype                    NUMBER,
TAJR_total                          NUMBER,
TAJR_remaining                      NUMBER,
TAJR_otherpaymentmethod             VARCHAR2 (30),
TAJR_totaldailyrentcost             NUMBER,
TAJR_totalhourlyrentcost            NUMBER,
TAJR_finaltotal                     NUMBER,
TAJR_previoustotalpaid              NUMBER,
TAJR_extradriverstotalcost          NUMBER,
TAJR_contractstatetypecode          NUMBER,
TAJR_contractstatuscode             NUMBER,
TAJR_drivearea                      VARCHAR2 (100),
TAJR_formatedplatenumber            VARCHAR2 (20),
TAJR_returnstatus                   VARCHAR2 (100),
TAJR_actualreturnbranchid           NUMBER,
TAJR_closurecode                    NUMBER,
TAJR_oilchangecost                      NUMBER,
TAJR_contractactualenddate          NUMBER,
TAJR_mainclosurecode                NUMBER,
TAJR_cancellationreason             VARCHAR2 (500),
TAJR_damagecost                     NUMBER,
TAJR_sparepartscost                 NUMBER,
TAJR_suspensioncode                 NUMBER,
TAJR_line_id                        NUMBER,
TAJR_response_code                      VARCHAR2 (100),
TAJR_errorkey                           VARCHAR2 (100),
TAJR_errorcode                          VARCHAR2 (100),
TAJR_errormessage                       VARCHAR2 (500),
TAJR_contract_image_ID                     NUMBER(12),
TAJR_rent_returnstatus                  VARCHAR2 (100),
TAJR_contractstatus                     VARCHAR2 (20),                                                      -- Status -- Open / Close / Cancel / Suspend
created_by                         NUMBER,
creation_date                      DATE
);

CREATE TABLE xxtaj_sketchinfo_detail
(
   tajeer_id       NUMBER NOT NULL,
   sketchinfo_id   NUMBER NOT NULL,
   line_id         NUMBER NOT NULL,
   record_type     NUMBER NOT NULL,                                                                                                -- 1 - Out / 2 - In
   damage_type     VARCHAR2 (100),                                                                                                   -- Dent / Scratch
   x_axis          VARCHAR2 (100),
   y_axis          VARCHAR2 (100),
   created_by      NUMBER,
   creation_date   DATE
);

CREATE TABLE xxtaj_contract_files
(
   TAJR_SEQ_NB          NUMBER(12) NOT NULL,
   TAJR_REF_SEQ_NB      NUMBER(12) NOT NULL,
   file_type            NUMBER NOT NULL,                                                                                                -- 1 - Out / 2 - In
   file                 BLOB,
   created_by           NUMBER,
   creation_date        DATE
);

  
  
  
  
  
  
  