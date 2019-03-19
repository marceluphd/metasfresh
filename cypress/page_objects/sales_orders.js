class SalesOrders {
  constructor() {
    this.windowId = 143;
    this.tableRows = '.table-flex-wrapper-row';
    this.rowSelector = 'tbody tr';
    this.listHeader = '.document-list-header';
    this.selectedRows = '.row-selected';
  }

  visit() {
    cy.visit(`/window/${this.windowId}`);
  }

  verifyElements() {
    cy.get(this.tableRows)
      .find(this.rowSelector)
      .eq(0)
      .should('exist');
  }

  getRows() {
    return cy.get(this.tableRows).find(this.rowSelector);
  }

  getSelectedRows() {
    return cy.get(this.selectedRows);
  }

  clickListHeader() {
    // TODO: Find scrollable element instead of forcing click
    // cy.get(this.documentList).scrollTo('top');
    // cy.get(this.listHeader).scrollIntoView();
    // cy.scrollTo('bottom')
    // cy.get('#root').scrollTo(0, 10);
    cy.get('.document-list-wrapper').scrollTo(0, 0);
    cy.get(this.listHeader).click({ force: true });
  }
}

export const salesOrders = new SalesOrders();
